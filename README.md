# ExceptionRunner

Exception Runner is a usefull form to treat the exceptions using Lambdas of Java 8

Examples 

public void method(parameter) thrown Exception{
}

public String stringMethod(parameter) throws Exception{
}

public Integer integerMethod(parameter) throws Exception{
}


Running with Exception Runner

runSafe(()-> method(parameter));

Integer integer = getSafe(()->integerMethod(new Integer(4)));

String string = getSafe(()->stringMethod("Hello Runner!"), ()->"On failure return this String");

String string = getSafe(()->stringMethod("Hello Runner!"), "On failure show this error");

