SET CHARACTER_SET_CLIENT = utf8mb4;
SET CHARACTER_SET_CONNECTION = utf8mb4;

/*********** テストデータの作成 ***********/

-- ユーザーテーブル
INSERT INTO office_system.users
    (account, password_hash, name, permission, is_enabled)
VALUES
    ('yamanouchi', '$2a$10$tsUOLljagW5Lz9BvKLKJTeXSZW3lvx3afbAAZC8Wbs7A41KRUpL76', '山之内', 'Admin', true),
    ('ando', '$2a$10$ryQU9pPhLSBaEmtdguYHWu1RSaxKEB1oiABKHGh.ho3ItdtrLd6sK', '安藤', 'Admin', true),
    ('araki', '$2a$10$dFStZtOnQJYORuYyApbrCOq47KQIPJSk8mTKZed8nRmjbsngsGJzm', '荒木', 'User', true),
    ('ayabe', '$2a$10$z0HRJInoEBmeYXoRWwX0XeqbNm.9O3RZK9.ehIWHh.rJn3vwa1mui', '綾部', 'User', true),
    ('doizaki', '$2a$10$EFXb7.5Kp7TqC4bvXIoosuV5Vlbkk9Thvu5WSg3LOPzFuxxJPrxvu', '土斐崎', 'User', true),
    ('ejima', '$2a$10$BvhXKyeYBLF43nC7kEfed.6zuybx/yV/0e1wweklOjI2hpUQidKe6', '江嶋', 'User', true),
    ('hanada', '$2a$10$92CmNQ3dl2rbYGbi3ZbgnuHj8dri.JsStmLOMXJHoVpeO29v/ArqK', '花田', 'User', true),
    ('hayashida', '$2a$10$UBFDCdHLmXfKwMDTe7UY7u5b09v36NfYdibvnexz7eEuIvURr8Atm', '林田', 'User', true),
    ('hidaka', '$2a$10$wZuLbSXHr244QRuqgxZsteHBlgd.Y0fn4d8nDj9Q50M9qcMYlbrqS', '日高', 'User', true),
    ('higuchi', '$2a$10$C2U2wfQAdsfwZc54C5MAweMRwz7L8npuo6oG/okPdTPuMPu3gjIcu', '樋口', 'User', true),
    ('iida', '$2a$10$n2SnwKvvPdWdhy1AQCviUep0YZuDmZ4Wv6nOdRYAq7miyM0nr4d/6', '飯田', 'User', true)
;
