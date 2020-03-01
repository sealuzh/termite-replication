# Transforms the evaluation sheet in a oracle sheets
# Excludes disagreements
require "csv"

class Array
    def sample(n)
        shuffle[0...n]
    end
end

eagers = []
CSV.parse(File.read("evaluations.csv"), {headers: true, col_sep: ","}) do |row|
    a = row["Simone Stinziani"]
    b = row["Giovanni Grano"]
    c = row["Simone Scalabrino"]
    
    evaluations = [a, b, c]
    pro_eager   = evaluations.count("1")
    con_eager   = evaluations.count("0")
    
    raise "No agreement on #{row}" if pro_eager == con_eager
    
    eager = pro_eager > con_eager
    
    eagers.push [row["test-suite"].sub("_ESTest", ""), row["test-method"], eager]
end

not_eagers = []
CSV.parse(File.read("test-method-smells.csv"), {headers: true, col_sep: ","}) do |row|
    next unless row["test-method"].start_with? "test"
    next if row["test-suite"].start_with? "org.gudy.azureus2.pluginsimpl.local.network.TransportImpl"
    not_eagers.push [row["test-suite"].sub("_ESTest", ""), row["test-method"], false] if row["isEagerTest"] == "0.0"
end

# not_eagers.delete_if { |e| e[0] == "weka.core.converters.Saver" }

dataset = eagers + not_eagers

CSV.open "eagers.csv", "w" do |csv|
    csv << %w(production-class test-method eager)
    
    dataset.each do |row|
        p row
        csv << row
    end
end
