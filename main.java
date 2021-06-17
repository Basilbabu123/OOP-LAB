

class CPU {
    int price;
    CPU(int price)
    {
        this.price=price;
    }
    class  processor{
        processor(int core,String manufacturer)
        {
            System.out.println("Cores"+core);
            System.out.println("Manufacturers:"+manufacturer);
        }
    }
    static class RAM{
        RAM(double memory,String manufacturer)
        {
            System.out.println("Memory:"+memory+"GB");
            System.out.println("Manufacturers:"+manufacturer);
        }
    }
}
public class main
{
    public static void main(String  args[])
    {
        CPU c = new CPU(20000);
        CPU.processor pr=c.new processor(8,"APPLE A14");
        new CPU.RAM(16,"APPLE INC");

    }
}