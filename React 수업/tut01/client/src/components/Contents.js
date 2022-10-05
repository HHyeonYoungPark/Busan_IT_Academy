function Header() {
  return (
    <div
      style={{
        marginTop: "50px",
        borderRadious: "10px",
        border: "1px solid #000",
      }}
    >
      <h1>Header</h1>
    </div>
  );
}

function Main() {
  return (
    <div style={{ backgroundColor: "tomato" }}>
      <p>Contents</p>
    </div>
  );
}

function Footer() {
  return (
    <div>
      <p>Footer</p>
    </div>
  );
}

//export default 함수명;
export { Header, Main, Footer };
