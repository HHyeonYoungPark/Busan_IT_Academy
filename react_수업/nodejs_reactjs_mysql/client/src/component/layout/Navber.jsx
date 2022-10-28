import React from "react";
import { Link } from "react-router-dom";

function Navber() {
  return (
    <div>
      <Link to="/">GetUsers</Link>
      <Link to="/adduser">AddUser</Link>
    </div>
  );
}

export default Navber;
