package memory;

public interface MemoryManager {
    abstract void allocateMemory(int size);
    default void freeMemory(){
        System.out.println("Memory freed");
    }
    static String getMemoryType()
    {
        return "Memory Type";
    }
}

class RAMManager implements MemoryManager
{

    @Override
    public void allocateMemory(int size) {
        System.out.println("Allocating RAM Memory");
    }

    @Override
    public void freeMemory() {
        MemoryManager.super.freeMemory();
    }
}

class DiskManager implements MemoryManager
{

    @Override
    public void allocateMemory(int size) {
        System.out.println("Allocating disk space");
    }

    @Override
    public void freeMemory() {
        MemoryManager.super.freeMemory();
    }
}

class MemoryTester {
    public static void main(String[] args) {
        RAMManager rm1= new RAMManager();
        DiskManager dm1= new DiskManager();
        rm1.allocateMemory(21);
        rm1.freeMemory();
        dm1.allocateMemory(12);
        dm1.freeMemory();
        System.out.println(MemoryManager.getMemoryType());
    }
}