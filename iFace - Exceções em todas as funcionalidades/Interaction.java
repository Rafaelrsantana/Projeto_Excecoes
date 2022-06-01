import java.util.Scanner;

public class Interaction {

    private String[] friends = new String[5]; 
    private int total_friends = 0;
    private String[] message = new String[5];
    private String[] community = new String[5];
    private String[] membros = new String[5];
    Scanner input = new Scanner(System.in);




    public void setFriend() {
        System.out.println("\nDigite o nome do usuario que voce deseja adicionar: ");
        String user_friend = input.nextLine();
        this.friends[total_friends] = user_friend;
        total_friends++;
        System.out.println("Solicitacao de amizade enviada!");

    }

    public void setMessage(String message, int i) {
        this.message[i] = message;
    }

    public void setCommunity(String community, int i) {
        this.community[i] = community;
        
    }

    public void setMyCommunity(String community, int i, String membros) {
        this.community[i] = community;
        this.membros[i] = membros;
    }

    public void getFriend() {
        for (int i = 0; i < friends.length; i++) {
            if(friends[i] != null) {
                System.out.println(friends[i]);
            }
        }
    }

    public void getMessage() {
        for (int i = 0; i < message.length; i++) {
            if(message[i] != null) {
                System.out.println(message[i]);
            }
        }
    }
    
    public void getCommunity() {
        for (int i = 0; i < community.length; i++) {
            if(community[i] != null) {
                System.out.println(community[i]);
            }
        }
    }

    public void getMembers() {
        for (int i = 0; i < membros.length; i++) {
            if(membros[i] != null) {
                System.out.println(membros[i]);
            }
        }
    }

    public void finish(){
        friends = null;
        message = null;
        community = null;
    }
}