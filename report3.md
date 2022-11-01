## プログラミングⅡ 
### 課題レポート3: リファクタリングを通してユニットテストとバージョン管理に慣れよう

<script type="text/javascript" async src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/MathJax.js?config=TeX-MML-AM_CHTML">
</script>
<script type="text/x-mathjax-config">
 MathJax.Hub.Config({
 tex2jax: {
 inlineMath: [['$', '$'] ],
 displayMath: [ ['$$','$$'], ["\\[","\\]"] ]
 }
 });
</script>

<div style="text-align: right;">
編集日:2022-XX-XX<br>
報告者:e225717 高嶺拓矢<br>  
協力者:なし
</div>

#### ステップ1: コードの準備
prog2全体として以前からgithubで管理していたため、report3単体のリポジトリは作成していません。
サブディレクトリのリンクが以下のものです
https://github.com/medicine-t/prog2_2022/tree/main/Task/report3
備考として、リポジトリのURLが以下の通りです
https://github.com/medicine-t/prog2_2022

#### ステップ2: 死亡した後で攻撃できてしまう件をどうにかしたい

```bash
$ git log -p -1
commit 1e5b2fd153897bba98810d726ded7ef5a4b07503
Author: Takuya Takamine <e225717@ie.u-ryukyu.ac.jp>
Date:   Tue Nov 1 09:26:45 2022 +0900

    report3 step2

diff --git a/Task/report3/app/src/main/java/jp/ac/uryukyu/ie/e225717/Enemy.java b/Task/report3/app/src/main/java/jp/ac/uryukyu/ie/e225717/Enemy.java
index ee86a90..b65660c 100644
--- a/Task/report3/app/src/main/java/jp/ac/uryukyu/ie/e225717/Enemy.java
+++ b/Task/report3/app/src/main/java/jp/ac/uryukyu/ie/e225717/Enemy.java
@@ -36,6 +36,9 @@ public class Enemy {
      * @param hero 攻撃対象
      */
     public void attack(Hero hero) {
+        if (dead) {
+            return;
+        }
         int damage = (int) (Math.random() * attack);
         System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.name, damage);
         hero.wounded(damage);

```