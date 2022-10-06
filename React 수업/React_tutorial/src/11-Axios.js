/*
1. Axios
    (1) 데이터베이스(3306), NodeJS(5000)와 같이 외부 서버에 있는 
        자료를 가지고 오거나 외부 서버에 저장할 때 쓰는 middleware

    (2) npm i axios

    (3) import axios from "axios";

    **(4) 비동기화 처리가 필요
        const 변수명 = async function() { // 함수 이름 앞에 async
           // 가지고 올때는 get, 저장할 때는 post
           // await는 메소드 앞에 
            const result = await axios.get("http://localhosw:3000/users"); 
            console.log(result.data);
        }   

    (5) url(주소) : localhost, 외부에서 만들어 놓은 주소도 사용 가능

    (6) axios - 자동으로 json을 지원함  

    **(7) 다른 포트번호를 사용할 때는
        - npm i cors
        - app.use(cors()); // Nodejs 미들웨어 부분에 추가하면 됨
        
    (8) await axios.get(url); -> result.data // 가지고 올때
        await axios.post(url, {저장할데이터}); //      
*/
