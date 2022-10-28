import "./App.css";
import Users from "./components/Users";
import Loading from "./components/Loading";
import axios from "axios";
import { useState, useEffect } from "react";

function App() {
  const [products, setProducts] = useState([]);
  const [loading, setLoading] = useState(true);

  const URL = "https://dummyjson.com/products";

  const fetchData = async function (err) {
    const result = await axios.get(URL);

    if (err) {
      throw err;
    } else {
      // console.log(result.data.products); 데이터가 콘솔로 넘어오는지 확인
      // 읽어서 저장하기 전까지 시간차가 생길 수 있음 : Loading..(true:로딩중, false:데이터전송완료)
      setLoading(false); // 데이터가 정상적으로 fetch
      setProducts(result.data.products);
    }
  };

  useEffect(() => {
    fetchData();
  }, []);

  if (loading) {
    return (
      <div>
        <Loading />
      </div>
    );
  }

  return <Users products={products} />;
}

export default App;
