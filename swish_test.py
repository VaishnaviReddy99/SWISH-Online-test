i = input()
li = [int(i) for i in i.split()]
x = li[0]
p = li[1]
total = x
p = 100-p
while x>0:
    t = (p/100)*x
    x = t
    total = total + t
sum1 = int(total)
print(sum1,"\n")
