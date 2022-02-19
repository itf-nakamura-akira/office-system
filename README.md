# office-system
オフィスシステムっぽいものを作りながらの勉強

## 開発環境

### データベース接続先

| Server Host | Port | Database | User | Password |
----|----|----|----|----
| localhost | 58450 | office_system | root | LU1ozVBNyuZXC0p8QJK4cvTREHMA3Wtfdsaer25Ow7iY9kjh6xIPSDFGglbnmq |

### データベースの初期化

docker containerのビルド時に開発用データベースが作成されるが、databaseディレクトリーで下記コマンドを実行することで、開発環境のデータベースを初期化することも出来る。

```
sh re-create.sh
```
