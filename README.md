# NRO Server

Máy chủ NRO được build bằng Maven và yêu cầu Java 17 trở lên. Dữ liệu game trong `data/` là dữ liệu runtime bên ngoài JAR; luôn chạy lệnh từ thư mục gốc của dự án.

## Chuẩn bị

1. Cài JDK 17+ và Maven 3.9+.
2. Sao chép `config/application.properties.example` thành `config/application.properties`.
3. Cập nhật thông tin máy chủ và kết nối database trong file cấu hình vừa tạo.
4. Import `database/nro.sql` vào MySQL/MariaDB.

## Build

```powershell
mvn clean package
```

Executable fat JAR được tạo tại `target/nro-server-1.0.0.jar`.

## Chạy

Từ thư mục gốc dự án:

```powershell
java -server -jar target/nro-server-1.0.0.jar
```

Trên Windows cũng có thể chạy `run.bat`. Thư mục `data/` phải tồn tại và tài khoản chạy ứng dụng phải có quyền ghi vào `data/update_data/` và `log/`.
