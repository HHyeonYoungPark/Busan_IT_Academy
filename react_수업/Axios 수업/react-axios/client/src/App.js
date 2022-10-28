import axios from "axios";
import { useState, useEffect } from "react";
import "./App.css";
import Tours from "./component/Tours";

function App() {
  const URL = "https://course-api.com/react-tours-project";
  const [tours, setTours] = useState([]);

  function deleteTour(tourID) {
    const result = tours.filter((tour) => tour.id !== tourID);
    setTours(result);
  }

  useEffect(() => {
    const fetchData = async function (err) {
      const result = await axios.get(URL);

      if (err) {
        throw err;
      } else {
        setTours(result.data);
      }
    };

    fetchData();
  }, []);

  //   console.log(tours);

  return (
    <div>
      <Tours tours={tours} deleteTour={deleteTour} />
    </div>
  );
}

export default App;
