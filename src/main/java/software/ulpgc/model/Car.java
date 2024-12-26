package software.ulpgc.model;

public record Car(int id,
                  String vin,
                  String makeAndModel,
                  Color color,
                  Transmision transmision,
                  Fuel fuel,
                  CarType type,
                  String plate,
                  String options,
                  String specs,
                  int kilometrage)
{
    public enum Color {
        Orange,
        Black,
        Red,
        White,
        Yellow,
        Blue,
        Green,
        Pink,
        Grey,
        Beige,
        Violet
    }

    public enum Transmision {
        CVT,
        Manual,
        Automanual,
        Automatic

    }

    public enum Fuel {
        Diesel,
        Gasoline,
        GasolineHybrid,
        CompressedNaturalGas,
        Electric,
        Ethanol,
        E85Gasoline
    }

    public enum CarType {
        Minivan,
        PassengerVan,
        RegularCabPickup,
        Sedan,
        Hatchback,
        Coupe,
        Convertible,
        CargoVan,
        Wagon,
        SUV,
        ExtendedCabPickup,
        CrewCabPickup
    }
}
