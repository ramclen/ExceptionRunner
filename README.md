# ExceptionRunner
---

##About
Exception Runner is a usefull form to treat the exceptions **without** the conventional and nasty **try catch**. 



##Examples of code

```Java
  public void method(parameter) thrown Exception{
  
  }

  public String stringMethod(parameter) throws Exception{
  
  }

  public Integer integerMethod(parameter) throws Exception{
  
  }
```
##Convetional way

```Java
  try{
    method(parameter);
  }catch{
    doSomething();
  }
```

```Java
  String string; 
  try{
    string = stringMethod(parameter);
  }catch{
    doSomething();
  }
```

```Java
  String string; 
  try{
    string = stringMethod(parameter);
  }catch{
    string = "On failure return this String";
  }
```

```Java
  Integer integer; 
  try{
    integer = integerMethod(parameter);
  }catch{
    doSomething();
  }
```

If you only use once it is not so uncomfortable, but what happen when you need a lot? It will not be easy see the code through the try-catches. Now me solution...

##With Exception Runner

```Java
  runSafe(()-> method(parameter));

  Integer integer = getSafe(()->integerMethod(new Integer(4)));

  String string = getSafe(()->stringMethod("Hello Runner!"), ()->"On failure return this String");

  String string = getSafe(()->stringMethod("Hello Runner!"), "On failure show this error");
```
Something better, right?  
