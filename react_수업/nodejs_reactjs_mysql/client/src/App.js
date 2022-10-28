import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Navber from "./component/layout/Navber";
import AddUser from "./component/pages/AddUser";
import GetUsers from "./component/pages/GetUsers";

function App() {
  return (
    <Router>
      <Navber />
      <Routes>
        <Route path="/" element={<GetUsers />} />
        <Route path="adduser" element={<AddUser />} />
      </Routes>
    </Router>
  );
}

export default App;
