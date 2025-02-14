# 🏗️ Spring Boot Application Deployment on AWS (EC2 + RDS)  

This guide explains how to **deploy a Spring Boot application** with **MySQL on AWS**, using **EC2 and RDS**.

---

## 🛠️ **Prerequisites**
Before you begin, ensure you have the following:
- ✅ **AWS Account**
- ✅ **EC2 Key Pair** (for SSH access)
- ✅ **MySQL Workbench / CLI** (for testing DB connection)
- ✅ **GitHub Repository** (to manage code)
- ✅ **Spring Boot JAR file** (built using `mvn package`)

---

## 📌 **1. Set Up AWS RDS (MySQL Database)**
### 🔹 **Create a MySQL Database**
1. Navigate to **AWS Console** → **RDS** → **Create Database**.
2. Select **MySQL** as the database engine.
3. Choose **Free Tier** (if eligible).
4. Set:
   - **DB Name:** `resume_db`
   - **Username:** `admin`
   - **Password:** `yourpassword`
5. Configure **VPC Security Group**:
   - **Allow EC2 to access MySQL** (port `3306`).
6. Click **Create Database** and copy the **JDBC Endpoint**.

---

## 📌 **2. Set Up AWS EC2 Instance**
### 🔹 **Launch an EC2 Instance**
1. Go to **AWS Console** → **EC2** → **Launch Instance**.
2. Select **Ubuntu 20.04 / Amazon Linux 2**.
3. Choose **Instance Type:** `t2.micro` (Free Tier).
4. Configure Security Groups:
   - **Allow inbound traffic** for:
     - `22` (SSH)
     - `8080` (Spring Boot)
     - `80` (HTTP, if using NGINX)
5. Click **Launch** and download the `.pem` key file.

### 🔹 **Connect to EC2 via SSH**
```bash
ssh -i your-key.pem ubuntu@your-ec2-ip
