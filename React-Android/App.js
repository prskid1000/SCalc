import React from 'react';
import { StyleSheet, Text, View, Button} from 'react-native';

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text: {
    fontWeight: 'bold',
    color:"green",
  }
});

class Display extends React.Component
{
  constructor(props){
      super(props);
      this.state={
        data:"0"
      }
  }

  change(data) {
    this.state.data= data;
    this.setState({data: this.state.data });
    }

  render(){
    return  (
      <Text style={styles.text}>
      {this.state.data}
      </Text>
    );
  }
}

class Butn extends React.Component
{
  constructor(props){
      super(props);
      this.state={
        title:this.props.name,
        ops:""
      }
      this.handleChange = this.handleChange.bind(this);
  }

  handleChange(event) {
    this.setState({ops:this.state.title},() => {
      if (this.props.onChange) {
        this.props.onChange(this.state);
      }
    });
    }

  render(){
    return (
      <Button
      title={this.state.title}
      color="#841584"
      onPress={()=>{this.handleChange()}}
      />
    );
  }
}


export default class App extends React.Component
{
    constructor(props){
        super(props);
        this.display=React.createRef();
        this.state={
          data:""
        }
    }

    eventButton = data => {
        if(data.ops === "=")
        {
          var res = parseInt(this.state.data.charAt(0));
          for(var i = 1; i < this.state.data.length;i+=2)
          {
            if(this.state.data.charAt(i) == "+")
            {
              res = res + parseInt(this.state.data.charAt(i+1));
            }
            if(this.state.data.charAt(i) == "-")
            {
              res = res - parseInt(this.state.data.charAt(i+1));
            }
          }

          this.state.data= res;
          this.setState({data: this.state.data });
          this.display.current.change(this.state.data);

        }
        else {
          this.state.data= this.state.data + data.ops;
          this.setState({data: this.state.data });
          this.display.current.change(this.state.data);
        }
      }

    render() {
        return (
          <View style={styles.container}>
            <table>
            <tbody>
            <tr>
            <th colSpan="3"><Display ref={this.display}/></th>
            </tr>
            <tr>
            <th><Butn name="+" onChange={this.eventButton}/></th>
            <th><Butn name="-" onChange={this.eventButton}/></th>
            <th><Butn name="=" onChange={this.eventButton}/></th>
            </tr>
            <tr>
            <th><Butn name="0" onChange={this.eventButton}/></th>
            <th><Butn name="1" onChange={this.eventButton}/></th>
            <th><Butn name="2" onChange={this.eventButton}/></th>
            </tr>
            <tr>
            <th><Butn name="3" onChange={this.eventButton}/></th>
            <th><Butn name="4" onChange={this.eventButton}/></th>
            <th><Butn name="5" onChange={this.eventButton}/></th>
            </tr>
            <tr>
            <th><Butn name="6" onChange={this.eventButton}/></th>
            <th><Butn name="7" onChange={this.eventButton}/></th>
            <th><Butn name="8" onChange={this.eventButton}/></th>
            </tr>
            </tbody>
            </table>
          </View>
        );
    }
}
