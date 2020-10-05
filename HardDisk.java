package Experiment1;

public class HardDisk {
     private int amount;
     private String tradename;

     HardDisk(int amount){
         setAmount(amount);
     }
     HardDisk(String tradename){
         setTradeName(tradename);
     }
    int getAmount(){
        return amount;
    }
    String getTradeName(){
         return tradename;
    }

    void setAmount(int amount) {
         if (amount >0 && amount < 300000)
            this.amount = amount;
         else {
             System.out.println("输入的硬盘大小有误");
         }
    }
    void setTradeName(String tradename){
         this.tradename = tradename;
    }
}
