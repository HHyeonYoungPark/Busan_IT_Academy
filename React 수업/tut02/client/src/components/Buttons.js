function Buttons() {
  let str = "busan it";

  function press() {
    // 매개변수 없을때
    alert("클릭됨");
  }

  function clicked(str) {
    // 매개변수 있을때
    alert(str);
  }

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <Buttons className="btn01" onClick={press}>
        Click
      </Buttons>
      <p></p>
      <Buttons className="btn01" onClick={() => clicked(str)}>
        Click2
      </Buttons>
    </div>
  );
}

export default Buttons;
