require "csv"

CSV.open "new_entropies.csv", "w" do |csv|
    csv << %w(production-class test-method entropy)
    Dir.glob("mosa/tests/**/*_ESTest.java").each do |evotest|
        content = File.read(evotest)
        
        package     = content.scan(/^package\s([^;]*);/).flatten[0] || ""
        classname   = File.basename(evotest).sub("_ESTest.java", "")
        
        complete_name = package.size > 0 ? package + "." + classname : classname
        
        entropy = nil
        content.split("\n").each do |test_line|
            t = test_line.scan(/\/*Coverage entropy=(.*)/).flatten[0]
            if t
                entropy = t
                next
            end
            
            tc = test_line.scan(/public void (test[0-9]+)/).flatten[0]
            if tc
                raise "Failure on #{complete_name}, #{tc}" unless entropy
                csv << [complete_name, tc, entropy]
                entropy = nil
            end
        end
    end
end
