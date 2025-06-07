
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyList {
    int n;
    Map<String, Integer> namaToIndex = new HashMap<>();
    LinkedList<Integer>[] adjListArray;
    int idx = 0;

    public AdjacencyList(int n) {
        this.n = n;
        adjListArray = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void tambahKota(String nama) {
        if (!namaToIndex.containsKey(nama)) {
            namaToIndex.put(nama, idx);
            idx++;
        }
    }

    public void tambahJalur(String dari, String ke) {
        int iDari = namaToIndex.get(dari);
        int iKe = namaToIndex.get(ke);

        adjListArray[iDari].add(iKe);
        adjListArray[iKe].add(iDari);
    }

    public String getKotaFromIndex(int index) {
        for (Map.Entry<String, Integer> entry : namaToIndex.entrySet()) {
            if (entry.getValue() == index) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void bfs(String mulai) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        int start = namaToIndex.get(mulai);

        visited[start] = true;
        queue.add(start);

        System.out.println("Urutan kunjungan (berdekatan dulu / BFS):");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(getKotaFromIndex(node));

            for (int neighbor : adjListArray[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void dfs(String mulai) {
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        int start = namaToIndex.get(mulai);

        stack.push(start);
        System.out.println("Urutan kunjungan (menjauh dari London / DFS):");

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.println(getKotaFromIndex(node));

                for (int neighbor : adjListArray[node]) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}
