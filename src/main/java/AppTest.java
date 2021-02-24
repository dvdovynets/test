public class AppTest {
    public static void main(String[] args) {
        String[] arr = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[i].equals("")) {
                            continue;
                        }
                        if (arr[j].equals("")) {
                            continue;
                        }
                        switch (arr[i]) {
                            case "NORTH" :
                            case "north" :
                                if (arr[j].equals("SOUTH") || arr[j].equals("south")) {
                                    arr[i] = arr[i].toUpperCase().replace("NORTH", "");
                                    arr[j] = arr[j].toUpperCase().replace("SOUTH", "");
                                }
                                break;
                            case "SOUTH" :
                            case "south" :
                                if (arr[j].equals("NORTH") || arr[j].equals("north")) {
                                    arr[i] = arr[i].toUpperCase().replace("SOUTH", "");
                                    arr[j] = arr[j].toUpperCase().replace("NORTH", "");
                                }
                                break;
                            case "WEST" :
                            case "west" :
                                if (arr[j].equals("EAST") || arr[j].equals("east")) {
                                    arr[i] = arr[i].toUpperCase().replace("WEST", "");
                                    arr[j] = arr[j].toUpperCase().replace("EAST", "");
                                }
                                break;
                            case "EAST" :
                            case "east" :
                                if (arr[j].equals("WEST") || arr[j].equals("west")) {
                                    arr[i] = arr[i].toUpperCase().replace("EAST", "");
                                    arr[j] = arr[j].toUpperCase().replace("WEST", "");
                                }
                                break;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();

                for (String s : arr) {
                    System.out.println(s);
                    if (!s.equals("")) {
                        sb.append(s).append(" ");

                    }
                }
                if (sb.length() == 0) {
                    String[] res = new String[0];
                    //return res;
                    System.out.println(res);
                }
                String[] res = sb.toString().split(" ");
                //return res;
        System.out.println(res);
    }

}
