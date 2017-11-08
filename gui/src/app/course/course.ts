export class Course{
  id: number;
  name: string;
  trainer: Trainer;
  facilitator: Trainer;
  participants: Participant[];
  client: Client;
}
