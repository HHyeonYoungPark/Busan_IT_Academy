import { useNavigate } from "react-router-dom";

function Orders() {
  const navigate = useNavigate();

  return (
    <div>
      <h2>Order here!!</h2>
      {/* back 버튼이동 */}
      {/* 주소이동 : usenavigate(import) -> navigate(사용할 때) */}
      <button onClick={() => navigate("/")}>Home</button>
      <button onClick={() => navigate(-1)}>Back</button>
    </div>
  );
}

export default Orders;
