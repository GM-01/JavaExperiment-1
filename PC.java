package Experiment1;

public class PC {
    private CPU cpu;
    private HardDisk HD;
    PC(CPU cpu){
        setCPU(cpu);
    }
    PC(HardDisk HD){
        setHardDisk(HD);
    }
   void setCPU(CPU cpu){
        this.cpu = cpu;
    }
    void setHardDisk(HardDisk HD){
        this.HD = HD;
    }
    public void show(){
        System.out.println("cpu speed:"+cpu.getSpeed());
        System.out.println("cpu brand:"+cpu.getBrand());
        System.out.println("cpu name:"+cpu.getName());
        System.out.println(HD.getTradeName()+":"+HD.getAmount()+"G");
    }
}
