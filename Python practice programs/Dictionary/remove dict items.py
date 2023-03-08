d1={
    "name":"thapash",
    "age":22,
    "subject":"python"
}
d1.pop("age")
d1.popitem()
del d1["name"]
del d1
#Error
d1.clear()
print(d1)