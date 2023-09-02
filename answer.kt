package com.example.greetingcard

fun main() {
    // 入力の読み取り
    print("Nを入力してください：")
    val n = readlnOrNull()?.toIntOrNull()?: 0

    if (n <= 0) {
        println("Nは1以上の整数である必要があります。")
        return
    }

    // ピラミッドの生成と出力
    for (i in 1..n) {
        // 空白を挿入
        for (j in 1..(n - i)) {
            print(" ")
        }

        // 数値を増加させる
        for (j in 1..i) {
            print(j % 10)
        }

        // 数値を減少させる
        for (j in i - 1 downTo 1) {
            print(j % 10)
        }

        println() // 改行
    }
}
