/*
    1. Web 
     - Server : 서비스 제공자 - naver, 넥슨 등 => 여러 사람이 사용
        - URI : domain, localhost 로 시작
        - PORT : 통로(ex 5000 - 통로 이름이 5000, 3000 - 통로 이름이 3000)
                 포트번호 80은 생략이 가능하다
        - Client가 정보를 요청(request, req), Server가 요청한 정보를 처리(response, res)                 

     - Client : 서비스 사용자 - 사용자 => 개인이 사용함
        - C:\, D:\ 저장위치

    2. url 주소
     - localhost, domain, c:\, d:\ -> 절대경로
     - / or ./ -> 상대경로
    
    *객체, 배열 -> 하나씩 데이터를 보내기 번거로우니까 뭉쳐서 보낼 때 사용 
    3. json : Javascript Object(객체) Notation
        - 회원 한명일 때 {회원1}
          - {key:value}
            "별명": 값
            "변수": 값

          ex) const user = {
                "username" : "홍길동",
                "password" : "12345",
                "age" : 27, (int로 함)
                "isActive" : false,
                "introduce" : null
              }; 

        - 회원이 여러명일 때
          - [{회원1}, {회원2}, {회원3}]
          
          ex) const user = [
               {
                 "userid" : "busanit",
                 "age" : 27
               },
               {
                 "userid" : "seoulit",
                 "age" : 17
               },
               {
                 "userid" : "deaguit",
                 "age" : 21
               }
             ];

    4. json을 사용하는 이유 : 인터넷으로 데이터를 전송하고 받을 때 json을 사용
      - 통신할 때 규칙(프로그래밍이 아님)
    
        - 사용자 -> 데이터 전송 -> (json변환) -> 서버
                                   haeder값에 json을 설정해서 보냄
                                    (Contant-Type:application/json)
                                   JSON.stringify();

        - 사용자 <- 데이터 전송 <- (json변환) <- 서버
                                   JSON.parse();

    ---------------------------------------------------------------------------        
    ***** Node.js : Server Javascript
     사용자 javascript 프로그래밍 -> (json파일로 변환해서) -> 서버로 전송
             user.js                    user.json

     사용자 javascript 프로그래밍 <- (json파일로 변환해서) <- 서버로 전송
             user.js                    user.json
    
    5. 연결 정보 : html(웹페이지)는 기본적으로 페이지가 바뀌면 기존 정보가 사라짐
       - session : 연결정보가 Server에 저장
         - 보안을 요하는 정보
         - 속도가 느릴 수 있다.

       - cookie : 연결정보가 내 컴퓨터(Client)에 저장(보안x)
         - 아이디 저장, 오늘하루 이창 띄우지 않기
         - 속도가 session보다 빠름    

*/
