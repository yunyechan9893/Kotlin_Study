# Install 1
## 😆 Ready

---

- USB를 들고 다니며 작업하기 때문에 E: 파일에 저장을 한 후 모든 PC에서 통용 작업을 할 수 있도록 작업하고 있다.

## ⭐ Start

---

1. **vscode 설치**
    - 포터블로 설치
        - USB에 담고 사용할 수 있도록 만듦
        
2. **jdk 설치**
- https://www.oracle.com/java/technologies/downloads/#jdk21-windows
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c91f68da-d32f-41a2-95f3-0e32a11e9abb/bda64bad-0730-4805-8b78-fcd9d4c94885/Untitled.png)
    
1. **kotlinc 설치**
- https://github.com/JetBrains/kotlin/releases
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c91f68da-d32f-41a2-95f3-0e32a11e9abb/c0d05e72-37a4-4bc5-a3c4-1f82ee34e0cc/Untitled.png)
    
1. **vscode extension**
- kotiln 설치
- Code Runner 설치

1. **환경설정**
- **PC 환경 설정**
    - jdk 환경 변수 설정
        - 아래 입력
            - JAVA_HOME
            - E:\jdk
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c91f68da-d32f-41a2-95f3-0e32a11e9abb/26c4b681-f56d-45c5-b9dc-ea36287a2f70/Untitled.png)
            
        - 아래 입력
            - %JAVA_HOME%\bin
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c91f68da-d32f-41a2-95f3-0e32a11e9abb/0fbfc6d0-89d0-45be-8189-282591c89401/Untitled.png)
            
    - kotlinc 환경 변수 설정
        - 아래 입력
            - E:\kotlinc\bin
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c91f68da-d32f-41a2-95f3-0e32a11e9abb/969ccaff-6b7d-4d6a-b423-aaf6d7464a98/Untitled.png)
            
- **vscode 설정**
    - Ctrl + , 클릭 > Configuration 입력 > Code-runner: Executor Map에 Edit in Settings.json 클릭
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c91f68da-d32f-41a2-95f3-0e32a11e9abb/d35dcb3c-a127-48e2-94c3-d30690ff7628/Untitled.png)
        
    - "kotlin": "파일경로 $fileName -include-runtime -d $fileNameWithoutExt.jar && java -jar $fileNameWithoutExt.jar" 추가
        - 여기서 파일경로는 코틀린 파일이 있는 곳으로 지정
        - ex) "kotlin": "cd E:\\PARA\\Projects\\kotlin_study && kotlinc $fileName -include-runtime -d $fileName.jar && java -jar $fileName.jar",
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c91f68da-d32f-41a2-95f3-0e32a11e9abb/66b23363-48bc-42a9-b054-555aa5c2b4c6/Untitled.png)
        
    

## 🔚 결과

---

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c91f68da-d32f-41a2-95f3-0e32a11e9abb/09e99afc-2258-4f0c-811a-594a62bfb664/Untitled.png)