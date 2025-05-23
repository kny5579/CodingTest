

import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) return cities.length * 5;

        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < cities.length; i++) {
            String lowCities = cities[i].toLowerCase();

            if (!list.isEmpty() && list.contains(lowCities)) {
                list.remove(lowCities);
                list.addLast(lowCities);
                answer++;
            } else {
                if (list.size() >= cacheSize) {
                    list.pollFirst();
                }
                list.add(lowCities);
                answer+=5;
            }
        }
        return answer;
    }
}