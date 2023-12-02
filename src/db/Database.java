package db;

public class Database {
    String s = "1. Profile (name,surname,phone unique,pswd,created_date,status,role)\n" +
            "  2. Card (number,exp_date,balance,status,phone,created_date)\n" +
            "  3. Terminal (code,address,status,created_date)\n" +
            "  4. Transaction (card_number,amount,terminal_code,type,created_date)\n";

    public static void createTable() {
        String transaction = "create table if not exists transaction(\n" +
                "id serial\n" +
                "card_number varchar(30)\n" +
                "amount varchar(30)\n" +
                "terminal_code varchar(30) unique\n" +
                "type varchar(10)\n" +
                "created_date timestamp\n" +


                ");";

        String terminal = "create table if not exists terminal(\n" +
                "id serial\n" +
                "code varchar(30)\n" +
                "address varchar(30)\n" +
                "status varchar(15)\n" +
                "created_date timestamp\n" +
                ");";

        String profile = "create table if not exists profile(\n" +
                "id serial\n" +
                "name varchar(30)\n" +
                "surname varchar(30)\n" +
                "phone varchar(30) unique\n" +
                "password varchar(50)\n" +
                "created_date timestamp\n" +
                "status varchar(15)\n" +
                "role varchar(15)\n" +
                ");";

        String card = "create table if not exists card(\n" +
                "id serial\n" +
                "numbers varchar(30)\n" +
                "exp_date varchar(30)\n" +
                "balance varchar(30)\n" +
                "status varchar(10)\n" +
                "phone varchar(15)\n" +
                "created_date timestamp\n" +
                ");";

    }
}
