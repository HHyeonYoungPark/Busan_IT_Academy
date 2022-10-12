import { useState } from "react";
import fetchData from "./data/data";
import Person from "./component/Person";
import "./App.css";

function App() {
  const [person, setPerson] = useState(fetchData);
  // console.log(person);

  return (
    <div>
      <button onClick={() => setPerson([])}>All clear</button>
      <Person person={person} />
    </div>
  );
}

export default App;
