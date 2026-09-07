import java.util.*;

class Solution {

    static class Node implements Comparable<Node> {
        int r, c, dir, turn;
        long cost;

        Node(int r, int c, int dir, int turn, long cost) {
            this.r = r;
            this.c = c;
            this.dir = dir;
            this.turn = turn;
            this.cost = cost;
        }

        public int compareTo(Node other) {
            return Long.compare(this.cost, other.cost);
        }
    }

    public int minCost(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        if (m == 1 && n == 1) {
            return grid[0][0];
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        long inf = Long.MAX_VALUE / 4;

        long[][][][] dist = new long[m][n][4][k + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int d = 0; d < 4; d++) {
                    Arrays.fill(dist[i][j][d], inf);
                }
            }
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (int d = 0; d < 4; d++) {
            int nr = dr[d];
            int nc = dc[d];

            if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                long cost = (long) grid[0][0] + grid[nr][nc];

                dist[nr][nc][d][0] = cost;
                pq.add(new Node(nr, nc, d, 0, cost));
            }
        }

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (cur.cost != dist[cur.r][cur.c][cur.dir][cur.turn]) {
                continue;
            }

            if (cur.r == m - 1 && cur.c == n - 1) {
                return (int) cur.cost;
            }

            for (int d = 0; d < 4; d++) {
                int nr = cur.r + dr[d];
                int nc = cur.c + dc[d];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                int newTurn = cur.turn;

                if (d != cur.dir) {
                    newTurn++;
                }

                if (newTurn > k) {
                    continue;
                }

                long newCost = cur.cost + grid[nr][nc];

                if (newCost < dist[nr][nc][d][newTurn]) {
                    dist[nr][nc][d][newTurn] = newCost;
                    pq.add(new Node(nr, nc, d, newTurn, newCost));
                }
            }
        }

        return -1;
    }
}