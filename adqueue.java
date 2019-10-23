
public class adqueue{
    int queue[]=new int [5];
    
    public void push (int value){
        if (queue[0]==0){
            queue[0]=value;
            System.out.println("Antrian Pertama :"+queue[0]);
        }else if(queue[1]==0){
            queue[1]=value;
            System.out.println("Antrian Kedua :"+queue[1]);
        }else if(queue[2]==0){
            queue[2]=value;
            System.out.println("Antrian Ketiga :"+queue[2]);
        }else if(queue[3]==0){
            queue[3]=value;
            System.out.println("Antrian Keempat :"+queue[3]);
        }else {
            isFull();
        }
        
    }
    
    public void isEmpty(){
        System.out.println("ANTRIAN KOSONG");
    }
    
    public void isFull(){
        System.out.println("ANTRIAN FULL");
    }
    
    public void pop(){
        if (queue[0]!=0){
            System.out.println("Antrian no "+queue[0]+" Masuk kamar cek");
            queue[0]=0;
        }else if (queue[1]!=0){
            System.out.println("Antrian no "+queue[1]+" Masuk kamar cek");
        }else if (queue[2]!=0){
            System.out.println("Antrian no "+queue[2]+" Masuk kamar cek");
        }else if (queue[3]!=0){
            System.out.println("Antrian no "+queue[3]+" Masuk kamar cek :");
        }else{
            isEmpty();
        }
    }
    
    public void cetak(){
        System.out.println("=======================");
        System.out.println("ANTRIAN PASIEN");
        for (int i = 0; i < queue.length; i++) {
            if (queue[i]!=0);
            System.out.println("Antrian Pasien nomor "+queue[i]);
            
        }
        System.out.println("=======================");
    }
    
    public static void main(String[] args) {
        adqueue x = new adqueue();
        x.push(1);
        x.push(2);
        x.push(3);
        x.push(4);
        x.push(5);
        x.cetak();
        x.pop();
        x.cetak();
        
        
    }
 
}