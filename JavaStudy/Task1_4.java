public class Task1_4 {

    // 定数（アカウント情報）
    // ① 登録されている名前（USER_RNAME）とパスワード（USER_PASSWORD）を定数で定義してください。
    String USER_RNAME = "arisa";
    String USER_PASSWORD = "0412";

    // 定数（メッセージ）
    String CONST_MSG_SUCCESS = "ログイン成功です。";
    String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
    String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";

    // 補足:
    //   定数は②〜⑤で使い回すために定義しておきます。
    //   final修飾子を付与すると、変数（動的に変わる値）ではなく、定数（変更不可な定まった値）となります。
    //   「ここへ記述」部分へ適当な値を記述しましょう。
    //   ※詳しくはJava2章にて紹介します。

    public static void main(String[] args) {
        // 以下の変数「name（名前）」「pass（パスワード）」を使用して、②〜⑤の条件を満たす処理を記述してください。
        // 名前とパスワードは画面からの入力値だと想定してみましょう。
         String name = "alice";
         String pass = "pass";

        // ② 変数nameの値が「 alice 」、変数passの値が「 pass 」であった場合、「 ログイン成功です 」と出力してください。
        if (name.equals("alice") && pass.equals("pass")) {
            System.out.println("ログイン成功です。");
        }


        // ③ 変数nameの値のみ正しい場合、定数を使用して「 パスワードに誤りがあります。 」と出力してください。
        else if (name.equals("alice") != pass.equals("pass")) {
            System.out.println("パスワードに誤りがあります。");
        }


        // ④ 変数passの値のみ正しい場合、定数を使用して「 名前に誤りがあります。 」と出力してください。
        else if (pass.equals("pass") != name.equals("alice")) {
            System.out.println("名前に誤りがあります。");
        }


        // ⑤ 変数nameも変数passの値も間違っていた場合は、定数を使用して「 入力情報に誤りがあります。 」と出力してください。
        else {
            System.out.println("入力情報に誤りがあります。");
        }

    }

}