/*
  1. nodejs 설치
  2. vscode
  3. Ctrl + ` => command
  4. 작업 : App.js, App.css
      - 모듈 : components
  5. node_modules 제외하고 백업
      - 백업 파일 다운로드 후 사용하려면 npm i (package.json 있어야 함)
 */

/*      
10월 06일 목요일 - React
Reactjs.org 페이지 참고
---------------------------------------------------------------------------------

React_tutorial 폴더생성
 - server 폴더
 - client 폴더

client 로 위치잡고 npx-create-react-app .

1. fontawsome, font : cdn
   > public - index.html

2. 로딩할 때 순서 (public, src 폴더에 있음)
   > index.html -> index.js -> App.js

3. src 폴더 안에
   components(모듈) - 폴더
   images - 폴더

4. NodeJS <- axios(미들웨어) -> ReactJS  
   node와 react 간 포트번호가 다르면 axios가 연결시켜줌
   - npm i axios - axios설치
   - npm i cors - 다른 포트번호를 사용할 때 보안해제
      (미들웨어)

React : 함수, 클래스
5. hook(user~ : useState, useEffect) : 함수
   - 데이터 저장 또는 관리
   - const[사용할 변수명, set변수명] = useState(초기값);
               사용할때       저장할때
     - import{useState} from "react";

6. 함수
 - 매개변수가 없을때 onClick={함수명}
 - 매개변수가 있을때 onClick={ ( ) => 함수명(값) }

7. input에 글자를 입력하는 event 처리
 input값을 저장하기 위해 useState로 저장 변수 생성 후
 <input type="text" onChange={ (e) => set변수명(e.target.value) } />

-----------------------------------------------------------------------------------
*/
