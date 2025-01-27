class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[] E = {0, 1};
        int[] S = {1, 0};
        int[] W = {0, -1};
        int[] N = {-1, 0};

        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                System.out.println(answer[0] + "," + answer[1]);
            }
        }
        for (int j = 0; j < routes.length; j++) {
            String[] arr = routes[j].split(" ");
            int len = Integer.parseInt(arr[1]);
            int answer0 = answer[0];
            int answer1 = answer[1];
            if (arr[0].equals("E")) {
                for (int k = 0; k < len; k++) {
                    answer[0] += E[0];
                    answer[1] += E[1];
                    System.out.println(answer[0] + "," + answer[1]);
                    if (answer[0]<0||answer[1]<0||(answer[0] >= park.length || answer[1] >= park[0].length())) {
                        answer[0]=answer0;
                        answer[1]=answer1;
                        break;
                    }
                    else if(park[answer[0]].charAt(answer[1]) == 'X'){
                        answer[0]=answer0;
                        answer[1]=answer1;
                        break;
                    }
                }

            } else if (arr[0].equals("S")) {
                for (int k = 0; k < len; k++) {

                    answer[0] += S[0];
                    answer[1] += S[1];
                    System.out.println(answer[0] + "," + answer[1]);
                    if (answer[0]<0||answer[1]<0||(answer[0] >= park.length || answer[1] >= park[0].length())) {
                        answer[0]=answer0;
                        answer[1]=answer1;
                        break;
                    }
                    else if(park[answer[0]].charAt(answer[1]) == 'X'){
                        answer[0]=answer0;
                        answer[1]=answer1;
                        break;
                    }

                }
            } else if (arr[0].equals("W")) {
                for (int k = 0; k < len; k++) {
                    answer[0] += W[0];
                    answer[1] += W[1];
                    System.out.println("W" + answer[0] + "," + answer[1]);
                    if (answer[0]<0||answer[1]<0||(answer[0] >= park.length || answer[1] >= park[0].length())) {
                        answer[0]=answer0;
                        answer[1]=answer1;
                        break;
                    }
                    else if(park[answer[0]].charAt(answer[1]) == 'X'){
                        answer[0]=answer0;
                        answer[1]=answer1;
                        break;
                    }

                }
            } else {
                for (int k = 0; k < len; k++) {
                    answer[0] += N[0];
                    answer[1] += N[1];
                    System.out.println(answer[0] + "," + answer[1]);
                    if (answer[0]<0||answer[1]<0||(answer[0] >= park.length || answer[1] >= park[0].length())) {
                        answer[0]=answer0;
                        answer[1]=answer1;
                        break;
                    }
                    else if(park[answer[0]].charAt(answer[1]) == 'X'){
                        answer[0]=answer0;
                        answer[1]=answer1;
                        break;
                    }
                }
            }
        }


        return answer;
    }

}