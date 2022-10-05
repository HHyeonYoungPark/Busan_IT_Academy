import Users from "./components/Users";

function App() {
  return (
    <>
      {/* <Users
        username={"부산광역시"}
        addr={"수영구"}
        contact={{ tel: "051-123-4567", hp: "010-1234-5678" }}
      /> */}
      <Users
        username={"부산광역시"}
        addr={"수영구"}
        tel={"051-123-4567"}
        hp={"010-1234-5678"}
      />

      <Users
        username={"서울특별시"}
        addr={"서초구"}
        tel={"051-123-4567"}
        hp={"010-1234-5678"}
      />
    </>
  );
}

export default App;
