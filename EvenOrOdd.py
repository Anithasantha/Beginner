num=input()
if(num.isalpha()):
  print("invalid")
else:
  num=int(num)
  if(num>0):
    if(num%2==0):
      print("Even")
    else:
      print("Odd")
  else:
    print("invalid")
