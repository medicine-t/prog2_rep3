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
編集日:2022-11-XX<br>
報告者:e225717 高嶺拓矢<br>  
協力者:なし
</div>

#### ステップ0: コードの準備
リポジトリは以下の場所である。report3と同じリポジトリである。
[https://github.com/medicine-t/prog2_rep3]()

#### ステップ1:EnemyクラスとHeroクラスの重複をどうにかしたい。
1. `gradle test`の結果
```bash
$ gradle test

BUILD SUCCESSFUL in 909ms
3 actionable tasks: 2 executed, 1 up-to-date
```

2. 今回のコード修正を通して、気づいたことを200字以上で報告せよ。  
LivingThingに主要な機能をまとめたことで、HeroとEnemyの内容を比較したときに相違点がより明確に示されていた。また、スーパークラスを作成する前はほとんど同じ内容が書かれており、特に同様のgetter/setterが両方のコードにあるなどでコードが冗長という印象を受けたが、共通する機能をまとめることでたしかに保守性が向上していると感じた。`@Override`アノテーションを意識的につけることで、意図しないオーバーライドの防止や引数を間違えるなどのミスを防止できることは、開発期間が長期になる程に役に立つ機能なのだろうと感じた。(271字)



