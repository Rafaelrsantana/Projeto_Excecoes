import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static int loadInput() {
        Scanner input = new Scanner(System.in);
        boolean correctInput = false;
        int key = 0;
        while (!correctInput) {
            try {
                key = Integer.parseInt(input.next());
                correctInput = true;
            } catch (Exception e) {
                System.out.println("Voce não digitou um numero(s)! Digite um numero(s) inteiro! ");

            }
        }
        return key;
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        Create_Edit user1 = new Create_Edit();
        Interaction interaction = new Interaction();
        Feed feed = new Feed();
        CommunityOwner owner = new CommunityOwner();
        Scanner input = new Scanner(System.in);
        ArrayList<Account> info_profile = new ArrayList();
        int accounts = 0;

        while (true) {
            System.out.println(
                    "Ola! Seja bem vindo(a) ao iFace! Digite o número da opção que deseja executar:\n1 - Criar conta\n2 - Entrar");
            String option = input.nextLine();
            boolean in = false;
            while(!in){
                if (option.equals("1")) {
                    try {
                        System.out.println("\nInsira o login: ");
                        String user = input.nextLine();
                        manager.setAccounts(user, accounts);
                        user1.setLogin(user);
    
                        System.out.println("Insira a senha(somente números!): ");
                        String key = input.nextLine();
                        manager.setPasswords(key, accounts);
                        user1.setPassword(key);
    
                        System.out.println("Insira seu nome de usuário: ");
                        String name = input.nextLine();
                        user1.setName(name);
    
                        accounts++;
                        in = true;
                        break;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Limite de contas criadas no iFace atingido!");
                    }
    
                } else if (option.equals("2")) {
                    System.out.println("\nInsira o login: ");
                    String user = input.nextLine();
                    int var = -1;
                    for(int i=0; i<3; i++) {
                        if(user.equals(manager.getAccounts(i))){
                            var = i;
                            
                        }
                    }
                    try {
                        System.out.println("Insira a senha(somente números!): ");
                        String password = input.nextLine();
                        if(password.equals(manager.getPasswords(var))) {
                            in = true;
                            break;
                        }else{
                            System.out.println("Senha incorreta!");
                        }
                        
                        
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Senha ou login incorretos! Ou conta não exixste.\n");
                    }
                    
                }
                    
                
                
                System.out.println(
                    "Ola! Seja bem vindo(a) ao iFace! Digite o número da opção que deseja executar:\n1 - Criar conta\n2 - Entrar");
                option = input.nextLine();

            }
            
            int friends = 0;
            int messages = 0;
            int communities = 0;
            int attributes = 0;

            System.out.println(
                    "\nOla! Seja bem vindo(a) ao iFace! Digite o numero da opcao que voce deseja executar:\n1 - Editar perfil\n2 - Adicionar amigos\n3 - Enviar mensagem\n4 - Comunidades\n5 - Recuperar informacoes\n6 - Encerrar conta\n7 - Privacidade\n8 - Sair");
            String option2 = input.nextLine();

            while (option2.equals("8") == false) {
                if (option2.equals("1")) {
                    System.out.println(
                            "\nDigite o numero da opcao que voce deseja editar ou se deseja criar um atributo:\n1 - Nome\n2 - Idade\n3 - Genero\n4 - Endereco\n5 - Telefone\n6 - Criar atributo\n7 - Voltar");
                    String option3 = input.nextLine();
                    while (option3.equals("7") == false) {
                        if (option3.equals("1")) {
                            System.out.println("Digite o novo nome: ");
                            String name = input.nextLine();
                            user1.setName(name);
                        } else if (option3.equals("2")) {
                            System.out.println("Digite a nova idade: ");
                            int key = loadInput();
                            user1.setAge(key);

                        } else if (option3.equals("3")) {
                            System.out.println("Digite o novo genero: ");
                            String gender = input.nextLine();
                            user1.setGender(gender);
                        } else if (option3.equals("4")) {
                            System.out.println("Digite o novo endereco: ");
                            String address = input.nextLine();
                            user1.setAddress(address);
                        } else if (option3.equals("5")) {
                            System.out.println("Digite o novo telefone(somente números!): ");
                            String phone = input.nextLine();
                            user1.setPhone(phone);
                        } else if (option3.equals("6")) {
                            try {
                                System.out.println("Digite o nome do atributo que voce deseja criar: ");
                                String attribute_name = input.nextLine();
                                System.out.println("Digite o atributo que voce deseja criar: ");
                                String attribute = input.nextLine();
                                user1.Create(attribute, attribute_name, attributes);
                                System.out.println("Atributo criado com sucesso!");
                                attributes++;

                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("O número máximo de atributos criados ja foi atingido!");
                            }
                        }
                        System.out.println(
                                "\nDigite o numero da opcao que voce deseja editar ou se deseja criar um atributo:\n1 - Nome\n2 - Idade\n3 - Genero\n4 - Endereco\n5 - Telefone\n6 - Criar atributo\n7 - Voltar");
                        option3 = input.nextLine();

                    }

                } else if (option2.equals("2")) {
                    try {
                        interaction.setFriend();
                        friends++;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Limite máximo de amigos atingido!");
                    }

                } else if (option2.equals("3")) {
                    System.out.println(
                            "\nVoce deseja enviar uma mensagem para um amigo, comunidade ou no feed de noticias? Digite o numero da opcao que voce deseja executar:\n1 - Amigo\n2 - Comunidade\n3 - Feed\n4 - Voltar");
                    String option4 = input.nextLine();
                    while (option4.equals("4") == false) {
                        if (option4.equals("1")) {
                            if (friends == 0) {
                                System.out.println(
                                        "Voce nao tem amigos adicionados! Voce pode adicionar amigos indo em Adicionar amigos no menu iFace.");
                            } else {
                                System.out.println("Digite o nome do amigo que voce deseja enviar a mensagem: ");
                                String friend = input.nextLine();
                                System.out.println("Digite a mensagem que voce deseja enviar: ");
                                String message = input.nextLine();
                                interaction.setMessage(message, messages);
                                messages++;
                                System.out.println("Mensagem enviada!");
                            }

                        } else if (option4.equals("2")) {
                            System.out.println("Digite o nome da comunidade que voce deseja enviar a mensagem: ");
                            String community = input.nextLine();
                            System.out.println("Digite a mensagem: ");
                            String message = input.nextLine();
                            interaction.setMessage(message, messages);
                            messages++;
                            System.out.println("Mensagem enviada!");

                        } else if (option4.equals("3")) {
                            try {
                                System.out.println("Digite a mensagem: ");
                                String message = input.nextLine();
                                interaction.setMessage(message, messages);
                                System.out.println("Mensagem enviada!");
                                messages++;

                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Máximo de mensagens no feed atingido!");
                            }
                        }
                        System.out.println(
                                "\nVoce deseja enviar uma mensagem para um amigo, comunidade ou no feed de noticias? Digite o numero da opcao que voce deseja executar:\n1 - Amigo\n2 - Comunidade\n3 - Feed\n4 - Voltar");
                        option4 = input.nextLine();
                    }

                } else if (option2.equals("4")) {
                    System.out.println(
                            "\nVoce deseja criar ou entrar em uma comunidade? Digite o numero da opcao que voce deseja executar:\n1 - Criar\n2 - Entrar");
                    String option5 = input.nextLine();

                    if (option5.equals("1")) {
                        try {
                            System.out.println("Digite o nome da comunidade que voce deseja criar: ");
                            String community = input.nextLine();
                            interaction.setMyCommunity(community, communities, user1.getUser());
                            System.out.println("Digite a descrição dessa comunidade: ");
                            String description = input.nextLine();
                            System.out.println("Sua comunidade " + community + " foi criada com sucesso!");
                            communities++;

                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Você só pode fazer parte de 10 comunidades!");
                        }

                    } else if (option5.equals("2")) {
                        try {
                            System.out.println("Digite o nome da comunidade que voce deseja entrar: ");
                            String community = input.nextLine();
                            interaction.setCommunity(community, communities);
                            System.out.println("Voce entrou na comunidade " + community + " com sucesso!");
                            communities++;

                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Você só pode fazer parte de 10 comunidades!");
                        }
                    }

                } else if (option2.equals("5")) {
                    System.out.println(
                            "\nDigite o numero da informacao que voce deseja recuperar:\n1 - Perfil\n2 - Amigos\n3 - Mensagens\n4 - Comunidades\n5 - Voltar");
                    String option6 = input.nextLine();
                    while (option6.equals("5") == false) {
                        if (option6.equals("1")) {
                            if (user1.getName() == null) {
                                System.out.println(
                                        "Nome nao cadastrado! Voce pode cadastrar indo em Editar perfil no menu iFace.");
                            } else {
                                System.out.println("Nome: " + user1.getName());
                            }
                            if (user1.getAge() == 0) {
                                System.out.println(
                                        "Idade nao cadastrada! Voce pode cadastrar indo em Editar perfil no menu iFace.");
                            } else {
                                System.out.println("Idade: " + user1.getAge());
                            }

                            if (user1.getGender() == null) {
                                System.out.println(
                                        "Genero nao cadastrado! Voce pode cadastrar indo em Editar perfil no menu iFace.");
                            } else {
                                System.out.println("Genero: " + user1.getGender());
                            }
                            if (user1.getAddress() == null) {
                                System.out.println(
                                        "Endereco nao cadastrado! Voce pode cadastrar indo em Editar perfil no menu iFace.");
                            } else {
                                System.out.println("Endereco: " + user1.getAddress());
                            }
                            try {
                                int key = Integer.parseInt(user1.getPhone());
                                System.out.println("Telefone: " + key);

                            } catch (NumberFormatException e) {
                                System.out.println(
                                        "Telefone nao cadastrado! Voce pode cadastrar indo em Editar perfil no menu iFace.");
                            }
                            user1.getAttribute();

                        } else if (option6.equals("2")) {
                            if (friends == 0) {
                                System.out.println(
                                        "Voce nao tem amigos adicionados! Voce pode adicionar amigos indo em Adicionar amigos no menu iFace.");
                            } else {
                                System.out.println("Seus amigos são: ");
                                interaction.getFriend();
                            }

                        } else if (option6.equals("3")) {
                            if (messages == 0) {
                                System.out.println(
                                        "Voce nao tem mensagens! Voce pode enviar mensagens indo em Mensagens no menu iFace.");
                            } else {
                                System.out.println("Suas mensagens são: ");
                                interaction.getMessage();
                            }

                        } else if (option6.equals("4")) {
                            if (communities == 0) {
                                System.out.println(
                                        "Voce nao tem comunidades! Voce pode criar ou fazer parte de comunidades indo em Comunidades no menu iFace.");
                            } else {
                                System.out.println("Suas comunidades são: ");
                                interaction.getCommunity();
                                System.out
                                        .println("Voce deseja saber os membros da sua comunidade? Digite sim ou nao:");
                                String option7 = input.nextLine();
                                if (option7.equals("sim")) {
                                    System.out.println("Os membros da sua comunidade são: ");
                                    owner.getMembers();
                                }
                            }

                        }
                        System.out.println(
                                "\nDigite o numero da informacao que voce deseja recuperar:\n1 - Perfil\n2 - Amigos\n3 - Mensagens\n4 - Comunidades\n5 - Voltar");
                        option6 = input.nextLine();
                    }

                } else if (option2.equals("6")) {
                    System.out.println(
                            "Voce realmente deseja encerrar sua conta? Digite a opcao que voce deseja executar: sim ou nao");
                    String option7 = input.nextLine();
                    if (option7.equals("sim")) {
                        user1.delete();
                        interaction.finish();
                        System.out.println("Voce encerrou sua conta com sucesso!");
                        System.exit(0);
                    } else if (option7.equals("nao")) {
                        System.out.println("Eba! Voce nao encerrou sua conta!");
                    }
                } else if (option2.equals("7")) {
                    System.out.println(
                            "Voce deseja que todos os usuarios possam ver suas mensagens no feed ou somente amigos? Digite 1 para Todos ou 2 para Somente amigos.");
                    String public_feed_response = input.nextLine();
                    try {
                        int key = Integer.parseInt(public_feed_response);
                        if (key == 1) {
                            feed.messageFeedAll();
                        } else if (key == 2) {
                            feed.messageFeedFriends();

                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Opcao invalida! Digite uma resposta válida.");
                    }

                } else if (option2.equals("8")) {
                    System.exit(0);
                }

                System.out.println(
                        "\nDigite o numero da opcao que voce deseja executar:\n1 - Editar perfil\n2 - Adicionar amigos\n3 - Enviar mensagem\n4 - Comunidades\n5 - Recuperar informacoes\n6 - Encerrar conta\n7 - Privacidade\n8 - Sair");
                option2 = input.nextLine();
            }

            info_profile.add(user1);

        }

    }
}