n=int(input())
flag=0
for i in range(2,(n//2)+1):
  if(n%i==0):
    flag=1
  else:
    flag=0
if(flag==0):
  print("yes")
else:
  print("no")
