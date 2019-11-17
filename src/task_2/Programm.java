  
package task_2;

class Program {
    static int gcd(int a, int b) {
        if (a == 0 && b == 0) throw new IllegalArgumentException("НОД(a ,b). Параметры a и b равны нулю.");
        return b == 0 ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        if (a == 0 && b == 0) throw new IllegalArgumentException("Нод(a ,b). Параметры a и b равны нулю.");
        return a / gcd(a, b) * b;
    }

}