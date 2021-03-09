plugins {
    val kotlinVersion = "1.4.30"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion
    id("net.mamoe.mirai-console") version "2.4.2"
}

group = "me.Eritque_arcus"
version = "1.0.0"

repositories {
    jcenter()
    //���ھ���Դ
    //��Ϊ��
    maven { url =uri("https://mirrors.huaweicloud.com/repository/maven") }
    //������
    maven { url =uri("https://maven.aliyun.com/nexus/content/repositories/jcenter")}
    //mirai-console�Ĳֿ�
    maven {url = uri("https://dl.bintray.com/him188moe/mirai")}
    //����ģ��Ĳֿ�
    // maven { url = uri("https://dl.bintray.com/karlatemp/misc") }
    mavenLocal()
    mavenCentral()
}
dependencies{
    //��IDE�����е�mcl��ӻ���ģ�飬��ο�https://github.com/project-mirai/mirai-login-solver-selenium�Ѱ汾����Ϊ����
    //runtimeOnly("net.mamoe:mirai-login-solver-selenium:1.0-dev-15")
    // https://mvnrepository.com/artifact/org.json/json
    implementation("org.json:json:20201115")

}