#Contact Form App -  react + spring boot
このシステムは、react+Spring boot を使用して構築した簡易のリスト管理アプリです。
Reactで構築されたフロントエンドと、Spring bootによるRestful APIを用いたバックエンドを連携させています。

#デモ
※AWSに配置予定(URL準備中)

#使用技術
##バックエンド
- springboot v3.4.3
- spring web / spring data JPA
- MySQL
- CORS設定(Reactとの接続用)

#実装機能
- リスト新規登録(POST)
- 一覧表示(GET)
- 各項目の編集(PUT)
- 各項目の削除(DELETE)
- バリデーション処理(空チェック、形式チェック)

#工夫したポイント
- spring boot 側でのController/ Service/ Repositoryの分割構成

#今後の予定
[ ] AWS上での本番デプロイ (ECS or Render or Vercel連携)
[ ] Spring securityによる認証追加
[ ] フロントのデザイン強化 (Tailwind CSSやMUI導入検討)

## 📄 ライセンス

このプロジェクトはMITライセンスのもとで公開されています。