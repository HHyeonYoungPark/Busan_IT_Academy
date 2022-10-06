// 회사이름을 메인에 표시하는 컴포넌트를 만들어보자
import Company from "./components/Company";
import Copyright from "./components/Footer";

function App() {
  return (
    // props:데이터전달 -> 받는 쪽에서는 매개변수로 props 또는 {변수명}
    <main>
      <Company title={"NodeJS"} contents={"ServerSide / FrontEnd"} />
      <Copyright company={"Seoul IT Academy"} />
    </main>
  );
}

export default App;
