eagers    <- read.csv("eagers.csv")
entropies <- read.csv("new_entropies.csv")

enclasses <- paste0(entropies$production.class,entropies$test.method)
eaclasses <- paste0(eagers$production.class,eagers$test.method)

print(setdiff(eaclasses, enclasses))

merged    <- merge(entropies, eagers, by=c("production.class", "test.method"))

write.csv(merged, "dataset.csv")
