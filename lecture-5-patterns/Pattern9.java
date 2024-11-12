
public class Pattern9 {

    public static void main(String args[]){
        System.out.println("------------------------------------------------------------");
        System.out.println("my logic");
        for (int i = 0; i < 5; i++){
            if(i % 2 == 0){
                for(int j = 0; j <= i; j++){
                    if(j % 2 == 0){
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
            } else {
                for(int j = 0; j <= i; j++){
                    if(j % 2 == 0){
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                } 
            }
            System.out.print("\n");
        }

        System.out.println("efficient logic");
        for (int i = 0; i < 5; i++){
                for(int j = 0; j <= i; j++){
                    if((j + i) % 2 == 0){
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
            System.out.print("\n");
        }
    }
}