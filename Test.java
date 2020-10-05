package Experiment1;

public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU(2800,"Intel");
        HardDisk hd = new HardDisk(512);
        PC pc = new PC(cpu);
        pc.setHardDisk(hd);
        cpu.setSpeed(3000);
        cpu.setBrand("AMD");
        cpu.setName("R7-4800H");
        hd.setTradeName("WD");
        pc.setCPU(cpu);
        pc.setHardDisk(hd);
        pc.show();
    }
}
