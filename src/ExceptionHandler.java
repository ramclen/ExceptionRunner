public class ExceptionHandler {
    public static <Type> Type getSafe(FunctionalWithException<Type> onSuccess, FunctionalWithoutException<Type> onFailure, String message) {
        try {
            return onSuccess.execute();
        } catch (Exception e) {
            System.err.println((message == null) ? e.getMessage() : message);
        }
        return onFailure==null? null : onFailure.execute();
    }

    public static <Type> Type getSafe(FunctionalWithException<Type> onSuccess, String message) {
        try {
            return onSuccess.execute();
        } catch (Exception e) {
            System.err.println((message == null) ? e.getStackTrace() : message);
        }
        return null;
    }

    public static <Type> Type getSafe(FunctionalWithException<Type> onSuccess, FunctionalWithoutException<Type> onFailure) {
        try {
            return onSuccess.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return onFailure==null? null : onFailure.execute();
    }

    public static <Type> Type getSafe(FunctionalWithException<Type> onSuccess) {
        try {
            return onSuccess.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void runSafe(FunctionalVoidWithException onSuccess) {
        try {
            onSuccess.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void runSafe(FunctionalVoidWithException onSuccess, FunctionalVoidWithoutException onFailure) {
        try {
            onSuccess.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        if(onFailure != null) onFailure.execute();
    }
}
