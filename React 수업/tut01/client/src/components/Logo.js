import logo from "../images/logo.png";

function Logo() {
  return (
    <>
      <img src={logo} alt="logo" />
      {/* alt를 꼭 써야함, 
      시각장애, 이미지 로딩 늦을때 등 이미지가 보이지 않을 때
      alt의 글자를 표시하거나 판독기가 읽어줌 */}
    </>
  );
}

export default Logo;
