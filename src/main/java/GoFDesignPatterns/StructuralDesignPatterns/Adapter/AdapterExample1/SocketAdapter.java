package GoFDesignPatterns.StructuralDesignPatterns.Adapter.AdapterExample1;

public interface SocketAdapter {

    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();
}
