import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CollatzVisualizer extends JPanel {
    // 存储 Collatz 序列的数字
    private ArrayList<Integer> collatzSequence = new ArrayList<>();

    // 构造函数：初始化 Collatz 序列
    public CollatzVisualizer(int n) {
        // 生成 Collatz 序列
        while (n != 1) {
            collatzSequence.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        collatzSequence.add(1);  // 最终加上 1
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);

        // 画 Collatz 序列的变化曲线
        int width = getWidth();
        int height = getHeight();
        int margin = 50;

        // 获取最大值和最小值，用于调整比例
        int maxVal = collatzSequence.stream().max(Integer::compare).get();
        int minVal = collatzSequence.stream().min(Integer::compare).get();

        // 绘制每个点
        for (int i = 1; i < collatzSequence.size(); i++) {
            int x1 = (i - 1) * (width - 2 * margin) / collatzSequence.size() + margin;
            int y1 = height - (collatzSequence.get(i - 1) - minVal) * (height - 2 * margin) / (maxVal - minVal) - margin;
            int x2 = i * (width - 2 * margin) / collatzSequence.size() + margin;
            int y2 = height - (collatzSequence.get(i) - minVal) * (height - 2 * margin) / (maxVal - minVal) - margin;

            // 画线段
            g.drawLine(x1, y1, x2, y2);
        }
    }

    public static void main(String[] args) {
        // 设置初始值 n
        int n = 27;

        // 创建 JFrame 并添加画板
        JFrame frame = new JFrame("Collatz Sequence Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new CollatzVisualizer(n));
        frame.setVisible(true);
    }
}